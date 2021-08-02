package com.example.samplerecyclerviewbinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samplerecyclerviewbinding.databinding.ItemContainerBinding;

import java.util.List;
import androidx.databinding.DataBindingUtil;

public class KitapAdapter extends RecyclerView.Adapter<KitapAdapter.KitapViewHolder> {
    private List<Kitap> kitapList;

    public KitapAdapter(List<Kitap>kitapList){
        this.kitapList=kitapList;
    }

    @NonNull
    @Override
    public KitapAdapter.KitapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        ItemContainerBinding binding=DataBindingUtil.inflate(inflater,R.layout.item_container,parent,false);
        return new KitapViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull KitapViewHolder holder, int position) {
        holder.binding.kitapAd.setText(kitapList.get(position).getKitapAdi());
        holder.binding.kitapYazari.setText(kitapList.get(position).getKitapYazari());
        holder.binding.kitapImage.setImageDrawable(kitapList.get(position).getKitapResim());
    }


    @Override
    public int getItemCount() {
        return kitapList.size();
    }


    public class KitapViewHolder extends RecyclerView.ViewHolder {
        private final ItemContainerBinding binding;
        public KitapViewHolder(ItemContainerBinding binding) {
            super(binding.getRoot());
                this.binding=binding;
        }
    }
}
