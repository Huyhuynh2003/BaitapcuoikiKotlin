package com.example.dacs_3.Adapter


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs_3.*
import com.example.dacs_3.Model.Option
import com.example.dacs_3.Lichthidau.Lichthidau
import com.example.dacs_3.Tintuc.Tintuc
import com.example.dacs_3.UI.Feedback


class HomeADT(
    private val context: Context,
    private val dataset: List<Option>
) : RecyclerView.Adapter<HomeADT.ItemViewHolder>(){
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.image_hero)
        val textView: TextView = view.findViewById(R.id.text_name)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): HomeADT.ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return HomeADT.ItemViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: HomeADT.ItemViewHolder,
                                  position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.name)
        holder.imageView.setImageResource(item.image)

        holder.imageView.setOnClickListener{
            when(item.name){
                R.string.tt->{
                    val i = Intent(context, Tintuc::class.java)
                    context.startActivity(i)

                  }
                R.string.ha->{
                    val i = Intent(context, Lichthidau::class.java)
                    context.startActivity(i)
                }
                R.string.vd->{
                    val i = Intent(context, Feedback::class.java)
                    context.startActivity(i)
                }
//                R.string.ten1->{
//                    val i = Intent(context, LichSu::class.java)
//                    context.startActivity(i)
//                }
//                R.string.ten1->{
//                    val i = Intent(context, ThongKe::class.java)
//                    context.startActivity(i)
//                }
            }
        }

    }
    override fun getItemCount() = dataset.size
}
