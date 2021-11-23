package dnbs.pam.latihanlia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dnbs.pam.latihanlia.model.ListData
import kotlinx.android.synthetic.main.rv_sample.*

class ListSample: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_sample)

        val listKontak = listOf(
            ListData(image = (R.drawable.lia), nama = "Lia Isnawati", nomor = "0999877888"),
            ListData(image = (R.drawable.bian), nama = "Bian Eka Nugraha", nomor = "0999877888"),
            ListData(image = (R.drawable.khanka), nama = "Khanka Abdurrahman", nomor = "0999877888"),
            ListData(image = (R.drawable.rendi), nama = "Rendi Supriatna", nomor = "0999877888"),
            ListData(image = (R.drawable.rizkyp), nama = "Rizky Purnama", nomor = "0999877888"),
            ListData(image = (R.drawable.rizki), nama = "Rizki Abdurochmanda", nomor = "0999877888")
        )

        val listSampleAdapter = ListSampleAdapter(listKontak)

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@ListSample)
            adapter = listSampleAdapter
        }
    }
}