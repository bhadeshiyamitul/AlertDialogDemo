package com.example.alertdialogdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var btnOne1: Button? = null
    private var btnTwo1: Button? = null
    private var btnThree1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne1 = findViewById(R.id.btnOne)
        btnTwo1 = findViewById(R.id.btnTwo)
        btnThree1 = findViewById(R.id.btnThree)

        btnOne1!!.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                    .setTitle("One")
                    .setMessage("This an example")
                    .setNeutralButton("Ok") { dialogInterface, _ ->
                        Toast.makeText(this, "Ok clicked", Toast.LENGTH_SHORT).show()
                        dialogInterface.dismiss()
                    }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        btnTwo1!!.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                    .setTitle("Two")
                    .setMessage("This an example")
                    .setPositiveButton("Ok") { dialogInterface, _ ->
                        Toast.makeText(this, "Ok clicked", Toast.LENGTH_SHORT).show()
                        dialogInterface.dismiss()
                    }
                    .setNegativeButton("Cancel") { dialogInterface, _ ->
                        Toast.makeText(this, "Cancel clicked", Toast.LENGTH_SHORT).show()
                        dialogInterface.dismiss()
                    }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        btnThree1!!.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                    .setTitle("Three")
                    .setMessage("This an example")
                    .setPositiveButton("Yes") { dialogInterface, _ ->
                        Toast.makeText(this, "Yes clicked", Toast.LENGTH_SHORT).show()
                        dialogInterface.dismiss()
                    }
                    .setNegativeButton("No") { dialogInterface, _ ->
                        Toast.makeText(this, "No clicked", Toast.LENGTH_SHORT).show()
                        dialogInterface.dismiss()
                    }
                    .setNeutralButton("Cancel"){ dialogInterface, _ ->
                        Toast.makeText(this, "Cancel clicked", Toast.LENGTH_SHORT).show()
                        dialogInterface.dismiss()
                    }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}
