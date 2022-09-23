package com.nightowl.inshort;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by CMRLABS on 04/22/2020.
 */

public class VerticlePagerAdapter extends PagerAdapter {

    String mHeadlineNews[] = {"MP policeman dies of COVID-19; govt announces ₹50 lakh aid, job to daughter",
            "Why did US crude oil price crash below zero for first time?",
                    "Family member of Rashtrapati Bhavan employee tests +ve for coronavirus",
                    "Brazil Prez coughs repeatedly during speech at protest over COVID-19 restrictions",
                    "3 policemen posted in Delhi's Nabi Karim containment zone test +ve",
                    "Govt making sanitiser for rich from poor people's share of rice: Rahul",
                    "Tejashwi urges Nitish to test Bihar journalists for coronavirus",
                    "Skin of Wuhan doctors ill with coronavirus turns dark after damage to livers",
                    "Andhra reports 35 new cases, state count rises to 757"};

    String mDetailNews[] = {"A police official in Madhya Pradesh’s Ujjain passed away due to COVID-19 led respiratory complications at a hospital in Indore on Tuesday. Chief Minister Shivraj Singh Chouhan announced monetary assistance of ₹50 lakh for his family and a job at the post of sub-inspector to the policeman’s daughter. The state government will award him Karmaveer Medal posthumously, Chouhan said."
            , "US benchmark oil futures contracts for May delivery fell below zero, meaning producers were paying buyers, because storage capacity is running out at Cushing city. With May contracts expiring on Tuesday, investors holding them didn't want to take physical delivery of oil and incur storage costs. When contracts expire, the holder has to take possession of oil, delivered to Cushing."
            , "A family member of a Rashtrapati Bhavan employee has tested positive for coronavirus at a quarantine facility at Delhi's Mandir Marg. The employee along with the family is a resident of Pocket 1, Schedule A area of the President's Estate. All other family members including the employee of the President's Secretariat have tested negative."
            , "Brazil's President Jair Bolsonaro has come under criticism for joining protesters demanding that restrictions on movement introduced to stop the spread of coronavirus be lifted. Bolsonaro was not wearing a mask and was seen coughing. He called those in attendance patriots and said they were helping defend individual freedoms that he said are under threat by authorities at state level."
            , "The Delhi Police has stated that three of its police personnel who were posted in Nabi Karim area, which is one of the 84 containment zones in the capital city, have tested positive for coronavirus. A total of 2,081 people have tested positive for Covid-19 in Delhi, of which 431 have been cured and 47 have passed away."
            , "Congress leader Rahul Gandhi on Tuesday criticised central government's decision to allow the use of surplus rice to make hand sanitiser amid coronavirus spread. When will the poor of India wake up? You are dying of hunger and they are busy in cleaning hands of the rich by making sanitiser from your share of rice, said Gandhi on Twitter."
            , "Leader of Opposition in Bihar Assembly Tejashwi Yadav has requested Bihar CM Nitish Kumar to test the journalists in the state for coronavirus. Yadav tweeted, Hon'ble CM is requested to test the journalists for coronavirus who are disseminating awareness and information about COVID-19 to the citizens. Like other corona warriors, they should also be ensured proper security and facilities."
            , "The skin of two doctors in China's Wuhan has turned darker after suffering liver damage from severe coronavirus infection. Doctors Yi Fan and Hu Weifeng beat coronavirus after two months of treatment, but both have been left with changed skin pigmentation, officials said. I felt scared. I often had nightmares, said Dr Yi about his skin condition."
            , "Andhra Pradesh has reported 35 new cases of coronavirus, taking the total number of cases in the state to 757, the state government has said. Ten of the cases were reported in Kurnool district, and nine in Guntur district. The total death toll in Andhra has risen to 22, while 96 people have been discharged from hospitals after completing treatment."};

    Context mContext;
    LayoutInflater mLayoutInflater;

    public VerticlePagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.content_main, container, false);

        TextView title = (TextView) itemView.findViewById(R.id.tvNewsTitle);
        TextView detailNews = (TextView) itemView.findViewById(R.id.tvNewsDetails);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.ivNewsImage);

        if (position % 2 == 0) {
            title.setText(mHeadlineNews[0]);
            detailNews.setText(mDetailNews[0]);
            imageView.setImageResource(R.drawable.images);
        } else {
            title.setText(mHeadlineNews[1]);
            detailNews.setText(mDetailNews[1]);
            imageView.setImageResource(R.drawable.ironman);
        }

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
