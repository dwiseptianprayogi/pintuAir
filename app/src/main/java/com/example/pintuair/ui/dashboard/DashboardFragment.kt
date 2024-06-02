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
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
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
        historyList!!.add(HistoryModel("Tertutup", "3","99", "1.3", "12/03/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup", "3","99", "1.2", "12/03/2024 16:00"))
        historyList!!.add(HistoryModel("Tertutup", "3", "97","1.3", "12/03/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.2", "12/03/2024 08:00"))
        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.3", "11/05/2024 21:00"))
        historyList!!.add(HistoryModel("Tertutup", "3","97", "1.3", "11/02/2024 16:00"))
        historyList!!.add(HistoryModel("Terbuka", "2", "95","1.3",  "11/02/2024 14:23"))
        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.2", "11/02/2024 12:00"))
        historyList!!.add(HistoryModel("Tertutup", "3", "99","1.3", "10/02/2024 08:00"))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}