package dnbs.pam.latihanlia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dnbs.pam.latihanlia.model.ListData
import kotlinx.android.synthetic.main.item_rvsample.view.*

class ListSampleAdapter (private val listKontak: List<ListData>) : RecyclerView.Adapter<ListSampleAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        p1: Int
    ): ViewHolder {
        return ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_rvsample,viewGroup,false))
    }

    override fun onBindViewHolder(holder: ListSampleAdapter.ViewHolder, position: Int) {
        holder.bindList(listKontak[position])
    }

    override fun getItemCount(): Int {
        return listKontak.size
    }

    inner class ViewHolder (view: View): RecyclerView.ViewHolder(view){
        fun bindList(listSample: ListData){
            itemView.apply {
                NamaKontak.text = listSample.nama
                Nomor.text = listSample.nomor
                Glide
                    .with(context)
                    .load(listSample.image)
                    .into(img);
            }
        }
    }
}