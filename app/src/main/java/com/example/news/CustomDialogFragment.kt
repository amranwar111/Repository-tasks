package com.example.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class CustomDialogFragment : DialogFragment() {

    fun newInstance(title: String?, ownerURL: String?): CustomDialogFragment {
        val frag = CustomDialogFragment()
        val args = Bundle()
        args.putString("desc", title)
        args.putString("ownerURL", ownerURL)
        frag.arguments = args
        return frag
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.description_dialog, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val descriptionTxt: TextView = view.findViewById(R.id.descDialogResult)
        val ownerURLTxt: TextView = view.findViewById(R.id.ownerUrlResult)
        val description: String? = arguments?.getString("desc", "No Description")
        val ownerURL: String? = arguments?.getString("ownerURL", "No URL")
        dialog?.setTitle(description)
        descriptionTxt.text = description
        ownerURLTxt.text = ownerURL
        descriptionTxt.requestFocus()
    }
}