package ru.lopata.madDiary.featureReminders.presentation.listEvents.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.lopata.madDiary.databinding.ItemTitleBinding
import ru.lopata.madDiary.featureReminders.domain.model.MainScreenItem
import ru.lopata.madDiary.featureReminders.presentation.listEvents.ListEventAdapter

class TitleViewHolder(val binding: ItemTitleBinding) : RecyclerView.ViewHolder(binding.root),
    MainListHolder {

    override fun bind(item: MainScreenItem) {
        val dateItem = item as MainScreenItem.DateItem
        binding.apply {
            if (dateItem.title != -1) {
                itemTitleDayTitle.text = itemView.context.getString(dateItem.title)
                itemTitleDate.text = dateItem.date
                itemTitleDate.visibility = View.VISIBLE
                itemTitleDivider.visibility = View.VISIBLE
                itemTitleDayTitle.visibility = View.VISIBLE
            }
            if (dateItem.title == -1) {
                itemTitleDayTitle.text = dateItem.date
                itemTitleDivider.visibility = View.GONE
                itemTitleDate.visibility = View.GONE
            }
        }
    }

    override fun onAttach(listener: ListEventAdapter.OnItemClickListener) {

    }

    override fun onDetach() {

    }
}