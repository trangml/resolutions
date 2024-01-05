
package com.example.resolutions

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resolutions.databinding.ActivityMainBinding

/*
class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        */
/*
        Handle action bar item clicks here. The action bar will
        automatically handle clicks on the Home/Up button, so long
        as you specify a parent activity in AndroidManifest.xml.
        *//*

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}*/
class MainActivity : AppCompatActivity() {

    private lateinit var resolutionsRecyclerView: RecyclerView
    private lateinit var resolutionsAdapter: ResolutionAdapter
    private lateinit var resolutions: List<Resolution>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resolutionsRecyclerView = findViewById(R.id.resolutionsRecyclerView)
        resolutionsRecyclerView.layoutManager = LinearLayoutManager(this)
        resolutions =  listOf(
            Resolution(1, "Do 10 minutes of pushups and situps everyday", false),
            Resolution(2, "Spend 30 minutes each day working on a project or learning something", false),
            Resolution(3, "Create and follow a monthly budget", false),
            Resolution(4, "Invest and DCA into the stock market, but do it smartly", false),
            Resolution(5, "Improve both mind and body", false),
            Resolution(6, "Communicate with friends and family more often", false),
            Resolution(7, "Contribute to open source", false),
            Resolution(8, "Get top 10 in a Kaggle or AIcrowd competition", false),
            Resolution(9, "Play more basketball", false),
            Resolution(10, "Spend less time on time-wasting apps or games", false)
        )
            resolutionsAdapter = ResolutionAdapter(resolutions)
        resolutionsRecyclerView.adapter = resolutionsAdapter
    }
}
