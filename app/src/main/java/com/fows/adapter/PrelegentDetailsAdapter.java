package com.fows.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fows.R;
import com.fows.presenter.PrelegentDetailsPresenter;
import com.fows.view.PrelegentDetailsViewInformationRow;
import com.fows.view.PrelegentDetailsViewPresentationRow;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public class PrelegentDetailsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static class InformationItem extends RecyclerView.ViewHolder implements PrelegentDetailsViewInformationRow {

        @BindView(R.id.prelegent_image_view)
        CircleImageView prelgentCircleImageView;

        @BindView(R.id.name_text_view)
        TextView nameTextView;

        @BindView(R.id.surname_text_view)
        TextView surnameTextView;

        @BindView(R.id.company_text_view)
        TextView companyTextView;

        @BindView(R.id.description_text_view)
        TextView descriptionTextView;

        @BindView(R.id.prelegent_presentation_header_text_view)
        TextView prelegentHeaderTextView;

        public InformationItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void displayName(String name) {
            nameTextView.setText(name);
        }

        @Override
        public void displaySurname(String surname) {
            surnameTextView.setText(surname);
        }

        @Override
        public void displayDescription(String description) {
            descriptionTextView.setText(description);
        }

        @Override
        public void displayCompany(String company) {
            companyTextView.setText(company);
        }

        @Override
        public void displayPhoto(String urlPhoto) {
            /*picasso.load(urlPhoto)
                    .into(prelgentCircleImageView);*/
        }

        @Override
        public void displayPrelegentHeader(String name, String surname) {
            Context context = prelegentHeaderTextView.getContext();
            String textViewFormatter = context.getString(R.string.item_prelegent_details_information_header_presentation_list);
            prelegentHeaderTextView.setText(String.format(textViewFormatter, name, surname));
        }
    }

    public static class PresentationItem extends RecyclerView.ViewHolder implements PrelegentDetailsViewPresentationRow {

        @BindView(R.id.start_time_text_view)
        TextView startTimeTextView;

        @BindView(R.id.day_text_view)
        TextView dayTextView;

        @BindView(R.id.theme_text_view)
        TextView themeTextView;

        public PresentationItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void displayStartTimePresentation(String startTime) {
            startTimeTextView.setText(startTime);
        }

        @Override
        public void displayDayPresentation(int day) {
            Context context = dayTextView.getContext();
            String textViewFormatter = context.getString(R.string.item_prelegent_details_number_day_of_presentation);
            dayTextView.setText(String.format(textViewFormatter, day));
        }

        @Override
        public void displayThemePresentation(String presentationOverview) {
            themeTextView.setText(presentationOverview);
        }

    }

    private static final int HEADER_COUNT = 1;
    private static final int HEADER_POSITION = 0;

    private static final int INFORMATION_ITEM_TYPE = 0;
    private static final int PRESENTATION_ITEM_TYPE = 1;

    private final PrelegentDetailsPresenter presenter;

    public PrelegentDetailsAdapter(PrelegentDetailsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case INFORMATION_ITEM_TYPE:
                return new InformationItem(LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_prelegent_details_information, parent, false));
            case PRESENTATION_ITEM_TYPE:
                return new PresentationItem(LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_prelegent_details_presentation, parent, false));
            default:
                throw new IllegalArgumentException("Invalid view type");
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == HEADER_POSITION) {
            bindInformation((InformationItem) holder);
        } else {
            bindPresentataion((PresentationItem) holder, position);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position == HEADER_POSITION ? INFORMATION_ITEM_TYPE : PRESENTATION_ITEM_TYPE;
    }

    @Override
    public int getItemCount() {
        return presenter.getPrelegentsPresentationCount() + HEADER_COUNT;
    }

    private void bindInformation(InformationItem viewHolder) {
        presenter.configureInformationRow(viewHolder);
    }

    private void bindPresentataion(PresentationItem viewHolder, int position) {
        presenter.configurePresentationRow(viewHolder, position - HEADER_COUNT);
    }
}
