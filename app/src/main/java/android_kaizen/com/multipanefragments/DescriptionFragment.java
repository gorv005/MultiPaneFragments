package android_kaizen.com.multipanefragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by derrickolivier on 3/01/15.
 */
public class DescriptionFragment extends Fragment {

    final static String KEY_POSITION = "position";
    int mCurrentPosition = -1;
    ListView listView;
    String[] mVersionDescriptions;
    TextView mVersionDescriptionTextView;
    AttendanceAdapter attendanceAdapter;
    public DescriptionFragment(){

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

      //  mVersionDescriptions = getResources().getStringArray(R.array.version_descriptions);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        attendanceAdapter=new AttendanceAdapter(getActivity(),getData());
        listView=(ListView)view.findViewById(R.id.layout_student_daily_attendance_listView);
        listView.setAdapter(attendanceAdapter);
    }

    ArrayList<AttendanceFields> getData(){

        ArrayList<AttendanceFields> attendanceFieldses=new ArrayList<>();
        for(int i=0;i<10;i++){
            AttendanceFields attendanceFields=new AttendanceFields("0"+i,"Upendra Kumar Sinha","Male","p");
            attendanceFieldses.add(attendanceFields);
        }
        return attendanceFieldses;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // If the Activity is recreated, the savedInstanceStare Bundle isn't empty
        // we restore the previous version name selection set by the Bundle.
        // This is necessary when in two pane layout
        /*if (savedInstanceState != null){
            mCurrentPosition = savedInstanceState.getInt(KEY_POSITION);
        }
*/

        View view = inflater.inflate(R.layout.fragment_description, container, false);

       // mVersionDescriptionTextView = (TextView) view.findViewById(R.id.version_description);
        return view;
    }


    @Override
    public void onStart() {
        super.onStart();

        // During the startup, we check if there are any arguments passed to the fragment.
        // onStart() is a good place to do this because the layout has already been
        // applied to the fragment at this point so we can safely call the method below
        // that sets the description text
       /* Bundle args = getArguments();
        if (args != null){
            // Set description based on argument passed in
            setDescription(args.getInt(KEY_POSITION));
        } else if(mCurrentPosition != -1){
             // Set description based on savedInstanceState defined during onCreateView()
            setDescription(mCurrentPosition);
        }*/
    }

    public void setDescription(int descriptionIndex){
       /* mVersionDescriptionTextView.setText(mVersionDescriptions[descriptionIndex]);
        mCurrentPosition = descriptionIndex;*/
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current description selection in case we need to recreate the fragment
       // outState.putInt(KEY_POSITION,mCurrentPosition);
    }
}
