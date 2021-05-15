package com.pratik.navcontrollerplayground.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.pratik.navcontrollerplayground.R
import com.pratik.navcontrollerplayground.databinding.FragmentSendCashReceiverBinding
import com.pratik.navcontrollerplayground.model.Utils

class SendCashReceiverFragment : Fragment() {

    private lateinit var binding: FragmentSendCashReceiverBinding
    val args: SendCashReceiverFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSendCashReceiverBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val receiverName = args.name
        binding.tvReceiverName.text = " Send Cash to ${receiverName}"

        Utils.saveAmount.observe(viewLifecycleOwner, Observer {
            binding.etMoney.setText(it.toString())
        })

        binding.btnCancel.setOnClickListener {
            //findNavController().popBackStack(R.id.navigation_home,true)
        }
        binding.btnSend.setOnClickListener {

            if (binding.etMoney.text.toString().isEmpty()) {
                Toast.makeText(context, "Please enter some amount", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val amount = binding.etMoney.text.toString().toLong()

            val action =
                SendCashReceiverFragmentDirections.actionSendCashReceiverFragmentToConfirmDialogFragment(
                    receiverName,
                    amount
                )

            findNavController().navigate(action)
        }

        binding.btnDone.setOnClickListener {
            xmlWay()
        }

        return root
    }

    fun programmaticalWay() {

        val pendingIntent =
            findNavController().createDeepLink()
                .setGraph(R.navigation.mobile_navigation)
                .setDestination(R.id.sendCashReceiverFragment)
                .setArguments(SendCashReceiverFragmentArgs("Ramos").toBundle())
                .createPendingIntent()

        findNavController().popBackStack(R.id.chooseReceiverFragment, true)
    }

    fun xmlWay() {
        val action =
            SendCashReceiverFragmentDirections.actionSendCashReceiverFragmentToNavigationHome("hello")
        findNavController().navigate(action)
    }


}