package featheryi.filtermenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.linroid.filtermenu.library.FilterMenu;
import com.linroid.filtermenu.library.FilterMenuLayout;

public class MainActivity extends AppCompatActivity {

    TextView text;
    FilterMenuLayout layout, layout2;
    FilterMenu menu, menu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        text.setText("CircularFloatingActionMenu\n需要自己設定“與邊界間距”的相對位置\n"+
                "item會自己排位，邊角不會穿出\n但建議邊角不要超出3個\n"+
                "可更改 FAM 的色彩、擴展大小\n內部 item 由圖形設置");

        layout = (FilterMenuLayout) findViewById(R.id.filter_menu);
        menu = new FilterMenu.Builder(this)
                .addItem(R.mipmap.icon_error)
                .addItem(R.mipmap.icon_gps)
                .addItem(R.mipmap.icon_lock)
//                .addItem(R.mipmap.icon_mark)
//                .addItem(R.mipmap.icon_money)
                .attach(layout)
                .withListener(new FilterMenu.OnMenuChangeListener() {
                    @Override
                    public void onMenuItemClick(View view, int position) {
                    }

                    @Override
                    public void onMenuCollapse() {
                    }

                    @Override
                    public void onMenuExpand() {
                    }
                })
                .build();

        layout2 = (FilterMenuLayout) findViewById(R.id.filter_menu2);
        menu2 = new FilterMenu.Builder(this)
                .addItem(R.mipmap.icon_error)
                .addItem(R.mipmap.icon_gps)
                .addItem(R.mipmap.icon_lock)
                .addItem(R.mipmap.icon_mark)
                .addItem(R.mipmap.icon_money)
                .attach(layout2)
                .withListener(new FilterMenu.OnMenuChangeListener() {
                    @Override
                    public void onMenuItemClick(View view, int position) {
                    }

                    @Override
                    public void onMenuCollapse() {
                    }

                    @Override
                    public void onMenuExpand() {
                    }
                })
                .build();
    }
}
