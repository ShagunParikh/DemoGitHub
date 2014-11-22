package com.example.materialdesigndemo;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class OtherActivity extends Activity{

	  private RecyclerView mRecyclerView;
	    private RecyclerView.Adapter mAdapter;
	    private RecyclerView.LayoutManager mLayoutManager;
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other_activity);
		
		
		 RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
         
	        // this is data fro recycler view
	        ItemData itemsData[] = { new ItemData("Help",R.drawable.thumb1),
	                new ItemData("Delete",R.drawable.thumb1),
	                new ItemData("Cloud",R.drawable.thumb1),
	                new ItemData("Favorite",R.drawable.thumb1),
	                new ItemData("Like",R.drawable.thumb1),
	                new ItemData("Rating",R.drawable.thumb1),
	                new ItemData("Delete",R.drawable.thumb1),
	                new ItemData("Cloud",R.drawable.thumb1),
	                new ItemData("Favorite",R.drawable.thumb1),
	                new ItemData("Like",R.drawable.thumb1),
	                new ItemData("Rating",R.drawable.thumb1),new ItemData("Delete",R.drawable.thumb1),
	                new ItemData("Cloud",R.drawable.thumb1),
	                new ItemData("Favorite",R.drawable.thumb1),
	                new ItemData("Like",R.drawable.thumb1),
	                new ItemData("Rating",R.drawable.thumb1)};
	        
	        // 2. set layoutManger
	        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
	        // 3. create an adapter 
	        MyAdapter mAdapter = new MyAdapter(itemsData);
	        // 4. set adapter
	        recyclerView.setAdapter(mAdapter);
	        // 5. set item animator to DefaultAnimator
	        recyclerView.setItemAnimator(new DefaultItemAnimator());
	 
	    }
	
	
	public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
	    private ItemData[] itemsData;
	 
	    public MyAdapter(ItemData[] itemsData) {
	        this.itemsData = itemsData;
	    }
	     
	    // Create new views (invoked by the layout manager)
	    @Override
	    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
	                                                   int viewType) {
	        // create a new view
	        View itemLayoutView = LayoutInflater.from(parent.getContext())
	                               .inflate(R.layout.item_view_layout, null);
	 
	        // create ViewHolder
	        
	        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
	        return viewHolder;
	    }
	 
	    // Replace the contents of a view (invoked by the layout manager)
	    @Override
	    public void onBindViewHolder(ViewHolder viewHolder, int position) {
	         
	        // - get data from your itemsData at this position
	        // - replace the contents of the view with that itemsData
	         
	        viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
	        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());
	 
	 
	    }
	     
	    // inner class to hold a reference to each item of RecyclerView 
	    public class ViewHolder extends RecyclerView.ViewHolder {
	        
	        public TextView txtViewTitle;
	        public ImageView imgViewIcon;
	         
	        public ViewHolder(View itemLayoutView) {
	            super(itemLayoutView);
	            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
	            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
	        }
	    }
	 
	 
	    // Return the size of your itemsData (invoked by the layout manager)
	    @Override
	    public int getItemCount() {
	        return itemsData.length;
	    }
	}
}
