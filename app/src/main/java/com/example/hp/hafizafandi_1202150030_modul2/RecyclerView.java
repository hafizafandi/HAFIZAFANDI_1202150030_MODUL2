package com.example.hp.hafizafandi_1202150030_modul2;

/**
 * Created by HP on 2/18/2018.
 */

class RecyclerView {
    private LinearLayoutManager layoutManager;
    private MenuAdapter adapter;

    public void setAdapter(MenuAdapter adapter) {
        this.adapter = adapter;
    }

    public void setLayoutManager(LinearLayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }
}
