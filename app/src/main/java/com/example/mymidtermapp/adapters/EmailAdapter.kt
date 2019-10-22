package com.example.mymidtermapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymidtermapp.R
import com.example.mymidtermapp.models.Email
import kotlinx.android.synthetic.main.email_item_layout.view.*

class EmailAdapter (private val emailList: List<Email>, private val context: Context) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onBindViewHolder(emailViewHolder: EmailViewHolder, index: Int) {
        emailViewHolder.titleTextView.text = emailList[index].names
        emailViewHolder.descriptionTextView.text = emailList[index].description
        emailViewHolder.timeTextView.text = emailList[index].ages
//        emailViewHolder.images.setImageDrawable(this.context.getDrawable(emailList[index].images))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        return EmailViewHolder(LayoutInflater.from(context).inflate(R.layout.email_item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    inner class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.email_title)
        val descriptionTextView: TextView = view.findViewById(R.id.email_description)
        val timeTextView: TextView = view.findViewById(R.id.email_time)
        //val images: ImageView = view.findViewById(R.id.email_images)
    }
}