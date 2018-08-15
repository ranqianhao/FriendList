package com.example.ranqianhao.friendlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private List<Map<String,Object>> lists;
    private SimpleAdapter adapter;
    private ListView listView;

    //显示的数据
    private String[] theme = {"张三","李四","王五"};
    private String[] content ={"我是张三，你好","我是李四，你好","我是王五，你好"};
    private int[] imageViews = {R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    listView = (ListView) findViewById(R.id.ll1);

    lists = new ArrayList<>();
        for(int i = 0;i < theme.length;i++){
            Map<String,Object> map =new HashMap<>();
            map.put("image",imageViews[i]);
            map.put("theme",theme[i]);
            map.put("content",content[i]);
            lists.add(map);
        }
         adapter = new SimpleAdapter(MainActivity.this, lists, R.layout.item1, new String[]{"image", "theme", "content"}, new int[]{R.id.img, R.id.text1, R.id.text2});
   listView.setAdapter(adapter);
    }

//    class MyListener implements AdapterView.OnItemClickListener {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Map<String, Object> mMap = (Map<String, Object>) mMyAdapter.getItem(position);
//            Toast.makeText(getActivity(), mMap.get("data").toString(), 0).show();
//        }
//    }
}
