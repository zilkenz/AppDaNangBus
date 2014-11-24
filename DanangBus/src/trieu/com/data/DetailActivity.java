package trieu.com.data;




import trieu.com.danangbus.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
 
public class DetailActivity extends Activity {
	
	String title;
    String description;
    String dialoginformation;
    String txttest;
    String tansuat;
    String changduong;
    String luotdi;
    String chitietluotdi;
    String luotve;
    String chitietluotve;
    String ctykhaithac;
    String thongtin1;
    String thongtin2;
    String thongtin3;
    String thongtin4;
    int image;
    	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);
        
        TextView tvTitleLabel = (TextView)findViewById(R.id.tvTitleLabel);
        TextView tvDescLabel = (TextView)findViewById(R.id.tvtimehoatdong);
        TextView tvGia = (TextView) findViewById(R.id.tvGia);
        TextView tvTansuat = (TextView) findViewById(R.id.tvTansuat);
        TextView tvChangduong = (TextView) findViewById(R.id.tvchangduong);
        TextView tvLuotdi= (TextView) findViewById(R.id.luotdi);
        TextView tvChitietluotdi= (TextView) findViewById(R.id.chitietluotdi);
        TextView tvLuotve= (TextView) findViewById(R.id.luotve);
        TextView tvChitietluotve= (TextView) findViewById(R.id.chitietluotve);
        TextView tvCtykhaithac= (TextView) findViewById(R.id.ctykhaithac);
        TextView tvThongtin1= (TextView) findViewById(R.id.thongtin1);
        TextView tvThongtin2= (TextView) findViewById(R.id.thongtin2);
        TextView tvThongtin3= (TextView) findViewById(R.id.thongtin3);
        TextView tvThongtin4= (TextView) findViewById(R.id.thongtin4);
        
        ImageView ivPrImage = (ImageView)findViewById(R.id.ivPrvImage);
        Button btn = (Button)findViewById(R.id.button1);
        
        
        Bundle extras = getIntent().getExtras(); 
    
        if (extras != null) {
           
        	title = extras.getString("province");
            tvTitleLabel.setText(title);
            btn.setText("Bản Đồ "+ title);
            dialoginformation = extras.getString("dialogmsg");
            
            image = extras.getInt("prvImg");
            ivPrImage.setImageResource(image);
        	
        	description = extras.getString("provincedesclabel");
            tvDescLabel.setText(description);
            
            txttest = extras.getString("txtlable");
            tvGia.setText(txttest);
            
            tansuat = extras.getString("tansuatlable");
            tvTansuat.setText(tansuat);
            
            changduong = extras.getString("changduonglable");
            tvChangduong.setText(changduong);
            

            luotdi = extras.getString("luotdilable");
            tvLuotdi.setText(luotdi);

            chitietluotdi = extras.getString("chitietluotdilable");
            tvChitietluotdi.setText(chitietluotdi);

            luotve = extras.getString("luotvelable");
            tvLuotve.setText(luotve);
            
            chitietluotve = extras.getString("chitietluotvelable");
            tvChitietluotve.setText(chitietluotve);
          
            ctykhaithac = extras.getString("ctykhaithaclable");
            tvCtykhaithac.setText(ctykhaithac);

            thongtin1 = extras.getString("thongtin1lable");
            tvThongtin1.setText(thongtin1);
            
            thongtin2 = extras.getString("thongtin2lable");
            tvThongtin2.setText(thongtin2);
            
            thongtin3 = extras.getString("thongtin3lable");
            tvThongtin3.setText(thongtin3);
            
            thongtin4 = extras.getString("thongtin4lable");
            tvThongtin4.setText(thongtin4);
          
        }
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				
				AlertDialog.Builder dlgAlert = new AlertDialog.Builder(DetailActivity.this);
				dlgAlert.setMessage(dialoginformation);
                dlgAlert.setTitle(title);
                dlgAlert.setNegativeButton("close", null);
                dlgAlert.create().show();
			}
		});
        
}
 
}
