package android_kaizen.com.multipanefragments;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by GAURAV on 10/15/2017.
 */

public class AttendanceAdapter extends BaseAdapter {


    private final LayoutInflater mInflater;
    private Activity activity;
    private int screen;

    private ArrayList<AttendanceFields> attendanceFieldses;
    public static View view;
    public AttendanceAdapter(Activity activity, ArrayList<AttendanceFields> attendanceFieldses ) {
        this.activity = activity;
        this.attendanceFieldses = attendanceFieldses;

        mInflater = LayoutInflater.from(activity);

    }

    @Override
    public int getCount() {
        return attendanceFieldses.size();
    }

    @Override
    public AttendanceFields getItem(int position) {
        return attendanceFieldses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = mInflater.inflate(
                    R.layout.layout_for_row_in_attendance, parent, false);
        }
        TextView tvSrNo = (TextView)convertView.findViewById(R.id.txtRowSn);
        TextView tvTeacherName = (TextView)convertView.findViewById(R.id.teacherName);
        TextView tvgender = (TextView)convertView.findViewById(R.id.gender);

        ImageView ivIcon = (ImageView) convertView.findViewById(R.id.imgBtnAttendace);
        ivIcon.setImageResource(R.drawable.present_popup);
        tvSrNo.setText(attendanceFieldses.get(position).getSrNo());
        tvTeacherName.setText(attendanceFieldses.get(position).getTeacherName());
        tvgender.setText(attendanceFieldses.get(position).getGender());

        return convertView;
    }
}
