package com.bzcode.appskeletonv14.utils;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.bzcode.appskeletonv14.R;
import com.bzcode.appskeletonv14.common.Config;
import com.bzcode.appskeletonv14.common.Constants;


public class AppDialogs {

    private Context mContext;
    private Dialog progressDialog;

    /**
     * to prevent dialog box showing multiple times
     * */
    private boolean isDialogBoxShowing = false;

    /**
     * constructor
     * */
    public AppDialogs(Context _context){
        mContext = _context;
    }

    /**
     * to show progress bar
     * */
    public void showProgressBar(){
        try{

            //check whether dialog box showing
            if(isDialogBoxShowing)
            {
                Log.e(Config.LOG_COMMON_TAG, "Dialog already showing");
                return;
            }

            if(progressDialog == null) {

                //set the flag true
                isDialogBoxShowing = true;

                //init the dialog for the alert
                progressDialog = createSimpleDialog(mContext, R.layout.diolog_progressbar, false);

                //avoid closing dialog on clicking outside
                progressDialog.setCancelable(false);

                //get the dialog window
                Window window = progressDialog.getWindow();
                window.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                //set the layout params for the dialog window
                window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);

            }else {
                progressDialog.show();
                Log.e("------------","progess showing");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * to show progress bar
     * */
    public void hideProgressbar(){
        try{

            //set the flag false
            isDialogBoxShowing = false;

            if(progressDialog!=null){
                progressDialog.dismiss();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * simple dialog stub
     * */
    private static Dialog createSimpleDialog(Context context, int layout, boolean alignTop) {

        try {
            final Dialog dialog = new Dialog(context);

            /*----- Aligning the dialog in top -----*/
            if (alignTop) {
                Window window = dialog.getWindow();
                WindowManager.LayoutParams wlp = window.getAttributes();
                wlp.y = 25;
                wlp.gravity = Gravity.TOP;
                window.setAttributes(wlp);
            }

            dialog.setContentView(layout);
            dialog.show();

            return dialog;

        } catch (Exception ex) {

            throw ex;
        }

    }
}
