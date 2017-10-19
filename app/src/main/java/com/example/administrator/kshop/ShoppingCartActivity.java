package com.example.administrator.kshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class ShoppingCartActivity extends Activity {

    private List<Product> mCartList;
    private ProductAdapter mProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppingcart);

        mCartList = ShoppingCartHelper.getCart();

        for(int i=0; i<mCartList.size(); i++) {
            mCartList.get(i).selected = false;
        }

        final ListView listViewCatalog = (ListView) findViewById(R.id.ListViewCatalog);
        mProductAdapter = new ProductAdapter(mCartList, getLayoutInflater(), true);
        listViewCatalog.setAdapter(mProductAdapter);

        listViewCatalog.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Product selectedProduct = mCartList.get(position);
                if(selectedProduct.selected == true)
                    selectedProduct.selected = false;
                else
                    selectedProduct.selected = true;

                mProductAdapter.notifyDataSetInvalidated();

            }
        });

        Button removeButton = (Button) findViewById(R.id.ButtonRemoveFromCart);
        removeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=mCartList.size()-1; i>=0; i--) {

                    if(mCartList.get(i).selected) {
                        mCartList.remove(i);
                    }
                }
                mProductAdapter.notifyDataSetChanged();
            }
        });

    }

}

