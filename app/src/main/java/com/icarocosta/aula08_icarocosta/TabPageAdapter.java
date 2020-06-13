package com.icarocosta.aula08_icarocosta;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPageAdapter extends FragmentStatePagerAdapter {

    Fragment tab1, tab2;

    public TabPageAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        tab1 = new DadosCliente();
        tab2 = new DadosEndereco();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return tab1;
        } else {
            return tab2;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Dados Pessoais";
        } else {
            return "Dados de Endereço";
        }
    }
}
