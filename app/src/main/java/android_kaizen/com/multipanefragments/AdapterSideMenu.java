package android_kaizen.com.multipanefragments;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSideMenu extends BaseAdapter {


    private final LayoutInflater mInflater;
    private Activity activity;
    private int screen;
    private ArrayList<SideMenuItem> sideMenuItems;
   public static View view;
    public AdapterSideMenu(Activity activity, ArrayList<SideMenuItem> sideMenuItems , int screen) {
        this.activity = activity;
        this.sideMenuItems = sideMenuItems;
        this.screen=screen;
        mInflater = LayoutInflater.from(activity);

    }

    @Override
    public int getCount() {
        return sideMenuItems.size();
    }

    @Override
    public SideMenuItem getItem(int position) {
        return sideMenuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = mInflater.inflate(
                    R.layout.side_item_menu, parent, false);
        }
        TextView tvMenuName = (TextView)convertView.findViewById(R.id.tvMenuName);
        tvMenuName.setText(activity.getResources().getString(getItem(position).getNameResourse()));
        ImageView ivIcon = (ImageView) convertView.findViewById(R.id.ivIcon);
        ivIcon.setImageResource((getItem(position).getImageNameResource()));

        return convertView;
    }
}
