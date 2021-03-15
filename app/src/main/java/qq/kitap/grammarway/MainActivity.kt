package qq.kitap.grammarway

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import qq.kitap.grammarway.ui.grammarway1.GrammarFragment1
import qq.kitap.grammarway.ui.grammarway2.GrammarFragment2
import qq.kitap.grammarway.ui.grammarway3.GrammarFragment3
import qq.kitap.grammarway.ui.grammarway4.GrammarFragment4

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {



    private lateinit var grammarFragment1: GrammarFragment1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = "Grammarway"

        val drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            (R.string.navigation_drawer_open),
            (R.string.navigation_drawer_close)
        ) {
        }

        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)


        grammarFragment1 = GrammarFragment1()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.nav_host_fragment, grammarFragment1)
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.nav_grammar1 ->{
                val fragment = GrammarFragment1()
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.nav_host_fragment, fragment)
                        .commit()
            }
            R.id.nav_grammar2 ->{
                val fragment = GrammarFragment2()
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.nav_host_fragment, fragment)
                        .commit()
            }
            R.id.nav_grammar3 ->{
                val fragment = GrammarFragment3()
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.nav_host_fragment, fragment)
                        .commit()
            }
            R.id.nav_grammar4 ->{
                val fragment = GrammarFragment4()
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.nav_host_fragment, fragment)
                        .commit()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }


}