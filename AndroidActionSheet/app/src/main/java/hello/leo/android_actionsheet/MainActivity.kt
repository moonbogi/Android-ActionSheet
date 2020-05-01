package hello.leo.android_actionsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomSheetDialog = BottomSheetDialog(this)
        val bottomSheetView = this.layoutInflater.inflate(R.layout.bottom_sheet_layout, null)
        bottomSheetDialog.setContentView(bottomSheetView)

        actionSheetButton.setOnClickListener {
            showDialogNotificationAction(bottomSheetDialog)
        }

        bottomSheetView.button1.setOnClickListener {
            Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_LONG).show()
        }
        bottomSheetView.button2.setOnClickListener {
            Toast.makeText(this, "Button 2 Clicked", Toast.LENGTH_LONG).show()
        }
        bottomSheetView.button3.setOnClickListener {
            Toast.makeText(this, "Button 3 Clicked", Toast.LENGTH_LONG).show()
        }
        bottomSheetView.button4.setOnClickListener {
            Toast.makeText(this, "Button 4 Clicked", Toast.LENGTH_LONG).show()
        }
        bottomSheetView.cancelAttachment.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
    }

    private fun showDialogNotificationAction(bottomSheetDialog: BottomSheetDialog) {
        bottomSheetDialog.show()

        val bottomSheetDialogFrameLayout =
            bottomSheetDialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
        bottomSheetDialogFrameLayout?.background = null
    }
}
