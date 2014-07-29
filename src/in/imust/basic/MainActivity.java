package in.imust.basic;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.widget.ListView;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {
    
	@ViewById
	ListView mList;
	
	@AfterViews
	void test () {
	}
	
	
}
