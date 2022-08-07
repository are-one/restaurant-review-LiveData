package id.one.restaurantreview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter(private val listReview: List<String>): RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_review, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewAdapter.ViewHolder, position: Int) {
        holder.tvItem.text = listReview[position]
    }

    override fun getItemCount(): Int {
        return  listReview.size
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvItem: TextView = view.findViewById(R.id.tvItem)
    }
}