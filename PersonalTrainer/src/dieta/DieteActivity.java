package dieta;

import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.Utente;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
 
public class DieteActivity extends Activity {
 
      private DrawerLayout mDrawerLayout;
      private ListView mDrawerList;
      private ActionBarDrawerToggle mDrawerToggle;
 
      private CharSequence mDrawerTitle;
      private CharSequence mTitle;
      CustomDrawerAdapter adapter;
 
      List<DrawerItem> dataList;
 
      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_diete);
 
            // Initializing
            dataList = new ArrayList<DrawerItem>();
            mTitle = mDrawerTitle = getTitle();
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            mDrawerList = (ListView) findViewById(R.id.left_drawer);
 
            mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
                        GravityCompat.START);
 
            // Add Drawer Item to dataList
            dataList.add(new DrawerItem("Consigliata per te", R.drawable.consig));
            dataList.add(new DrawerItem("Aumento massa muscolare", R.drawable.massa));
            dataList.add(new DrawerItem("Dimagrimento", R.drawable.dimag));
            dataList.add(new DrawerItem("Rassodamento", R.drawable.rassod));
            
 
            adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item,
                        dataList);
 
            mDrawerList.setAdapter(adapter);
 
            mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
 
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().setHomeButtonEnabled(true);
 
            mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                        R.drawable.ic_drawer, R.string.drawer_open,
                        R.string.drawer_close) {
                  public void onDrawerClosed(View view) {
                        getActionBar().setTitle(mTitle);
                        invalidateOptionsMenu(); // creates call to
                                                                  // onPrepareOptionsMenu()
                  }
 
                  public void onDrawerOpened(View drawerView) {
                        getActionBar().setTitle(mDrawerTitle);
                        invalidateOptionsMenu(); // creates call to
                                                                  // onPrepareOptionsMenu()
                  }
            };
 
            mDrawerLayout.setDrawerListener(mDrawerToggle);
 
            if (savedInstanceState == null) {
                  SelectItem(0);
            }
 
            mDrawerLayout.openDrawer(mDrawerList);
      }
 
      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
      }
 
      public void SelectItem(int possition) {
 
            Fragment fragment = null;
            Bundle args = new Bundle();
            switch (possition) {
            case 0:
                  fragment = getFragment();
                  args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 1:
                  fragment = new DietaAumentoM();
                  args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 2:
                  fragment = new DietaDim();
                  args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 3:
                  fragment = new DietaRass();
                  args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
           
            default:
                  break;
            }
 
            fragment.setArguments(args);
            FragmentManager frgManager = getFragmentManager();
            frgManager.beginTransaction().replace(R.id.container, fragment)
                        .commit();
 
            mDrawerList.setItemChecked(possition, true);
            setTitle(dataList.get(possition).getItemName());
            mDrawerLayout.closeDrawer(mDrawerList);
 
      }
 
      @Override
      public void setTitle(CharSequence title) {
            mTitle = title;
            getActionBar().setTitle(mTitle);
      }
 
      @Override
      protected void onPostCreate(Bundle savedInstanceState) {
            super.onPostCreate(savedInstanceState);
            // Sync the toggle state after onRestoreInstanceState has occurred.
            mDrawerToggle.syncState();
      }
 
      @Override
      public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            // Pass any configuration change to the drawer toggles
            mDrawerToggle.onConfigurationChanged(newConfig);
      }
 
      @Override
      public boolean onOptionsItemSelected(MenuItem item) {
            // The action bar home/up action should open or close the drawer.
            // ActionBarDrawerToggle will take care of this.
            if (mDrawerToggle.onOptionsItemSelected(item)) {
                  return true;
            }
 
            return false;
      }
 
      public Fragment getFragment(){
    	  Utente u=getUtente();
          Fragment f;
  		int peso=Integer.parseInt(u.getPeso());
  		double h=Integer.parseInt(u.getAltezza())*0.01;
  		double BMI=peso/(h*h);
  		
  		if(BMI<18)
          /* settare la dieta consigliata*/
         f=new DietaAumentoM();
  		
  		else if(BMI>18 && BMI <26 && u.getSesso().equals("Femmina"))
  			f=new DietaRass();
  		
  		else if(BMI>18 && BMI <26 && u.getSesso().equals("Maschio"))
  			 f=new DietaAumentoM();
  		else
  			f= new DietaDim();
  		
  		return f;
      }
      
      public Utente getUtente(){
    	  
      	File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
        Utente u=null;
  		File f = new File(directory,"LogInPT");

  		File fmem=new File(getFilesDir()+File.separator+"LogInPT");
  		
  		if(f.exists()){
  			ObjectInputStream in=null;
  			try {
  				in = new ObjectInputStream(new FileInputStream(f));
  				 u = (Utente) in.readObject();
  				 in.close();
  				 return u;
  			} catch (StreamCorruptedException e1) {
  				// TODO Auto-generated catch block
  				e1.printStackTrace();
  			} catch (FileNotFoundException e1) {
  				// TODO Auto-generated catch block
  				e1.printStackTrace();
  			} catch (IOException e1) {
  				// TODO Auto-generated catch block
  				e1.printStackTrace();
  			}
  			 catch (ClassNotFoundException e) {
  						// TODO Auto-generated catch block
  						e.printStackTrace();
  					}
  					
  			}
  			else{
  				ObjectInputStream in=null;
  				try {
  					in = new ObjectInputStream(new FileInputStream(fmem));
  					 u = (Utente) in.readObject();
  					 in.close();
  					 return u;
  				} catch (StreamCorruptedException e1) {
  					// TODO Auto-generated catch block
  					e1.printStackTrace();
  				} catch (FileNotFoundException e1) {
  					// TODO Auto-generated catch block
  					e1.printStackTrace();
  				} catch (IOException e1) {
  					// TODO Auto-generated catch block
  					e1.printStackTrace();
  				}
  			      catch (ClassNotFoundException e) {
  							// TODO Auto-generated catch block
  							e.printStackTrace();
  						} 
  	
      
             }
  		
  		return u;
         }
      
        private class DrawerItemClickListener implements
                  ListView.OnItemClickListener {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                        long id) {
                  SelectItem(position);
 
            }
      }
}