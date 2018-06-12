package pdfviewer.pdfviewer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;


public class BookGenersView extends Activity {
    ListView list;
    Context context;
    String[] web = {
            "Adventure",
            "Biographies",
            "Fiction",
            "Geography",
            "History",
            "Science",
            "technology"
    } ;
    String[] nam= {"ಸಾಹಸ",
            "ಜೀವನಚರಿತ್ರೆ",
            "ಕಲ್ಪನೆ",
            "ಭೂಗೋಳ",
            "ಇತಿಹಾಸ",
            "ವಿಜ್ಞಾನ",
            "ತಂತ್ರಜ್ಞಾನ"


    };
    Integer[] imageId = {
            R.drawable.adven,
            R.drawable.biogr,
            R.drawable.fict,
            R.drawable.gloe,
            R.drawable.hist,
            R.drawable.chem,
            R.drawable.techno


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_geners_view);

        ImageButton launch = (ImageButton) findViewById(R.id.launch_btn);
        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.mobisystems.ubreader_west");
                if (launchIntent != null)
                    startActivity(launchIntent);
                else {
                    Intent feed_back = new Intent(Intent.ACTION_VIEW);
                    feed_back.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.mobisystems.ubreader_west"));
                    startActivity(feed_back);
                }
            }
        });
 /*       CustomList adapter = new
                CustomList(BookGenersView.this, web, imageId,nam);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
//
                SharedPreferences settings = getSharedPreferences("category", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("name",String.valueOf(position));
                editor.commit();
                Intent i = new Intent(BookGenersView.this,MainActivity.class);
                i.putExtra("category",String.valueOf(position));
//                PreferenceManager.getDefaultSharedPreferences(context).edit().putString("MYLABEL", String.valueOf(position)).apply();

                startActivity(i);
                Toast.makeText(BookGenersView.this, "You Clicked at " +web[+ position]+"/"+nam[+position], Toast.LENGTH_SHORT).show();

            }
        });*/




    }

}
