package trieu.com.danangbus;

import trieu.com.data.DetailActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;





public class RouteFragment extends Activity {
	
	 String[] provinces = new String[]{
    		 "Tuyến số 1: Đà Nẵng – Hội An ",
    		 "Tuyến số 2: Kim Liên – Chợ Hàn",
    		 "Tuyến số 3: Đà Nẵng – Ái Nghĩa",
    		 "Tuyến số 4: Đà Nẵng – Tam Kỳ ",
    		 "Tuyến số 6: Đà Nẵng - Mỹ Sơn",
    		 "Tuyến số 9: Thọ Quang – Đại Chánh",
    		
     };
 // Images belonging to the ListView items
 int[] myImageList = new int[]{
		 R.drawable.mot,
		 R.drawable.hai,
		 R.drawable.ba,
		 R.drawable.bon,
		 R.drawable.sau,
		 R.drawable.chin,
		 
 };


	
         
 @Override
public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.fragment_route);
 
    
  ListView provincelist = (ListView)findViewById(R.id.lvProvinceNames);

  //add header to listview
 LayoutInflater inflater = getLayoutInflater();
 ViewGroup header = (ViewGroup)inflater.inflate(R.layout.listheader, provincelist, false);
 provincelist.addHeaderView(header, null, false);
  
  	
  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, provinces);
  provincelist.setAdapter(adapter);
  provincelist.setOnItemClickListener(new OnItemClickListener(){

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		
		//we use the items of the listview as title of the next activity
		 String province = provinces[position-1];
		final int prvImg = myImageList[position-1];
		
			//we retrieve the description of the juices from an array defined in arrays.xml
			String[] provincedescription = getResources().getStringArray(R.array.provincedescription);
	        final String provincedesclabel = provincedescription[position-1];
	        
	        String[] txttest = getResources().getStringArray(R.array.txttest);
	        final String txtlable = txttest[position-1];
	        
	        String[] tansuat = getResources().getStringArray(R.array.tansuat);
	        final String tansuatlable = tansuat[position-1];
	        
	        String[] changduong = getResources().getStringArray(R.array.changduong);
	        final String changduonglable = changduong[position-1];
	        
	        String[] luotdi = getResources().getStringArray(R.array.luotdi);
	        final String luotdilable = luotdi[position-1];
	        
	        String[] chitietluotdi = getResources().getStringArray(R.array.chitietluotdi);
	        final String chitietluotdilable = chitietluotdi[position-1];
	        
	        String[] luotve = getResources().getStringArray(R.array.luotve);
	        final String luotvelable = luotve[position-1];
	        

	        String[] chitietluotve = getResources().getStringArray(R.array.chitietluotve);
	        final String chitietluotvelable = chitietluotve[position-1];
	        

	        String[] ctykhaithac = getResources().getStringArray(R.array.ctykhaithac);
	        final String ctykhaithaclable = ctykhaithac[position-1];
	        

	        String[] thongtin1 = getResources().getStringArray(R.array.thongtin1);
	        final String thongtin1lable = thongtin1[position-1];

	        String[] thongtin2 = getResources().getStringArray(R.array.thongtin2);
	        final String thongtin2lable = thongtin2[position-1];
	        

	        String[] thongtin3 = getResources().getStringArray(R.array.thongtin3);
	        final String thongtin3lable = thongtin3[position-1];

	        String[] thongtin4 = getResources().getStringArray(R.array.thongtin4);
	        final String thongtin4lable = thongtin4[position-1];
	        
	        //retrieve content for the dialog
	        String[] dialogmessage = getResources().getStringArray(R.array.dialogmessage);
	        final String dialogmsg = dialogmessage[position-1];
     
     
     
     Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
     intent.putExtra("province", province);
     intent.putExtra("provincedesclabel", provincedesclabel);
     intent.putExtra("txtlable",txtlable);
     intent.putExtra("tansuatlable",tansuatlable);
     intent.putExtra("changduonglable",changduonglable);
     intent.putExtra("luotdilable",luotdilable);
     intent.putExtra("chitietluotdilable",chitietluotdilable);
     intent.putExtra("luotvelable",luotvelable);
     intent.putExtra("chitietluotvelable",chitietluotvelable);
     intent.putExtra("ctykhaithaclable",ctykhaithaclable);
     intent.putExtra("thongtin1lable",thongtin1lable);
     intent.putExtra("thongtin2lable",thongtin2lable);
     intent.putExtra("thongtin3lable",thongtin3lable);
     intent.putExtra("thongtin4lable",thongtin4lable);
     intent.putExtra("prvImg", prvImg);
     intent.putExtra("dialogmsg", dialogmsg);

     startActivity(intent);
     
     
	}
	   
	   
});
 
}
}