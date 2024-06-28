package com.example.pintuair.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pintuair.databinding.FragmentDashboardBinding
import com.example.pintuair.model.HistoryModel

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var historyList:ArrayList<HistoryModel>? = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()

        var adapter = HistoryAdapter(historyList!!)
        var layoutManager = LinearLayoutManager(activity)
        binding.rcList.layoutManager = layoutManager
        binding.rcList.adapter = adapter
    }

    private fun initDataDummy() {
        historyList = ArrayList()
//        historyList!!.add(HistoryModel("Tertutup", "3","99", "1.3", "12/03/2024 21:00"))
//        historyList!!.add(HistoryModel("Tertutup", "3","99", "1.2", "12/03/2024 16:00"))
//        historyList!!.add(HistoryModel("Tertutup", "3", "97","1.3", "12/03/2024 12:00"))
//        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.2", "12/03/2024 08:00"))
//        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.3", "11/05/2024 21:00"))
//        historyList!!.add(HistoryModel("Tertutup", "3","97", "1.3", "11/02/2024 16:00"))
//        historyList!!.add(HistoryModel("Terbuka", "2", "95","1.3",  "11/02/2024 14:23"))
//        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.2", "11/02/2024 12:00"))
//        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.3", "10/02/2024 08:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "12/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.2","Aman", "12/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "97", "1.3","Aman", "12/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.2","Aman", "12/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "11/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "97", "1.3","Aman", "11/03/2024 16:00"))
        historyList!!.add(HistoryModel("Terbuka","Mati","2", "95", "1.3","Tinggi Air Kurang Dari 3 cm", "11/03/2024 14:23"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.2","Aman", "11/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "11/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Hidup","5", "99", "1.5","Aman", "10/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Tinggi Air Melebihi Batas", "10/03/2024 17:13"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "98", "1.3","Aman", "10/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "97", "1.3","Aman", "10/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "10/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Mati","3", "97", "1.3","Aman", "09/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "98", "1.2","Aman", "09/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "97", "1.3","Aman", "09/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "09/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "08/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "08/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "08/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "08/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "07/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "97", "1.3","Aman", "07/03/2024 16:00"))
        historyList!!.add(HistoryModel("Terbuka","Mati","3", "97", "0.8","Tinggi Air Kurang Dari 3 cm", "07/03/2024 13:16"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "98", "1.3","Aman", "07/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "07/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Mati","3", "99", "1.3","Aman", "06/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "98", "1.3","Aman", "06/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","3", "97", "1.3","Aman", "06/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","4", "99", "1.3","Aman", "06/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Mati","4", "99", "1.3","Aman", "05/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","4", "98", "1.2","Aman", "05/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","4", "96", "1.3","Aman", "05/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","4", "99", "1.3","Aman", "05/03/2024 08:00"))

        historyList!!.add(HistoryModel("Tertutup","Mati","4", "99", "1.3","Aman", "04/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","4", "98", "1.2","Aman", "04/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","4", "96", "1.2","Aman", "04/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup","Mati","4", "99", "1.3","Aman", "04/03/2024 08:00"))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}