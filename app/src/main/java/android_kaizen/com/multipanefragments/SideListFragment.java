package android_kaizen.com.multipanefragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SideListFragment extends Fragment  {

    ListView listView;
AdapterSideMenu adapterSideMenu;
    public SideListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_side_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapterSideMenu = new AdapterSideMenu(getActivity(), getSideMenuList(),0);
        listView=(ListView)view.findViewById(R.id.lvMenuItem);
        listView.setAdapter(adapterSideMenu);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                OnVersionNameSelectionChangeListener listener = (OnVersionNameSelectionChangeListener) getActivity();
                listener.OnSelectionChanged(position);
            }
        });
    }

    public static ArrayList<SideMenuItem> getSideMenuList() {
        ArrayList<SideMenuItem> sideMenuItems = new ArrayList<SideMenuItem>();
        sideMenuItems.add(new SideMenuItem(R.string.Techer_Attendance, R.drawable.ic_teacher_attendance));
        sideMenuItems.add(new SideMenuItem(R.string.Student_Attendance, R.drawable.ic_student_attendance));
        sideMenuItems.add(new SideMenuItem(R.string.Quarterly_Indicator, R.drawable.ic_quarterly_indicators));
        sideMenuItems.add(new SideMenuItem(R.string.manage_leaves, R.drawable.ic_manage_leaves));

        return sideMenuItems;
    }
}
