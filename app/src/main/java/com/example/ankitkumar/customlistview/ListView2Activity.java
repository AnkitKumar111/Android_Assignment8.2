package com.example.ankitkumar.customlistview;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.AdapterView.OnItemClickListener;
        import android.widget.ListView;
        import android.widget.Toast;

/**
 * Created by Ankit Kumar on 7/2/2017.
 */

public class ListView2Activity extends Activity implements OnItemClickListener
{
    /** Called when the activity is first created. */

    ListView lview;
    ListViewAdapter lviewAdapter;

    private final static String name[] = {"Pushpa","Latha","Arjun","Kiran","Arnav",
    };

    private final static String number[] = {"9988778877", "9988778874","9988778844",
            "7988778877","9968778877"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview = (ListView) findViewById(R.id.listView2);
        lviewAdapter = new ListViewAdapter(this, name, number);

        System.out.println("adapter => "+lviewAdapter.getCount());

        lview.setAdapter(lviewAdapter);

        lview.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(this,"Title => "+name[position]+"=> n Description"+number[position], Toast.LENGTH_SHORT).show();
    }
}
