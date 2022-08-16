package ru.madmax.madnotes.presentation.list_note

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import ru.madmax.madnotes.R
import ru.madmax.madnotes.databinding.FragmentListNoteBinding

@AndroidEntryPoint
class ListNoteFragment : Fragment(R.layout.fragment_list_note) {

    private var _binding: FragmentListNoteBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ListNoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.list_menu, menu)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListNoteBinding
            .inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listNoteAdapter = ListNoteAdapter()

        binding.noteListRecycler.apply {
            adapter = listNoteAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }

        viewModel.notes.observe(viewLifecycleOwner){
            listNoteAdapter.submitList(it)
        }

        binding.noteListBtnCreateNote.setOnClickListener {
            it.findNavController().navigate(R.id.action_listNoteFragment_to_createNoteFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}