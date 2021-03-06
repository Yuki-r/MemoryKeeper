package com.xcynice.memorykeeper.module.study.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

import com.gyf.immersionbar.ImmersionBar;
import com.xcynice.memorykeeper.R;
import com.xcynice.memorykeeper.base.BaseActivity;
import com.xcynice.memorykeeper.base.BasePresenter;
import com.xcynice.memorykeeper.bean.CardBag;
import com.xcynice.memorykeeper.bean.ResponseCard;

public class CardActivity extends BaseActivity {

    private ConstraintLayout mCardActivity;
    private TextView mCardQuestion;
    private TextView mCardAnswer;
    private TextView mCardMore;
    private ResponseCard card;


    /**
     * 创建 presenter
     *
     * @return presenter
     */
    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    /**
     * 得到布局文件 id
     *
     * @return layout id
     */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_card;
    }

    /**
     * 初始化布局
     */
    @Override
    protected void initView() {
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            card = (ResponseCard) bundle.getSerializable("card");
        }
        mCardActivity = findViewById(R.id.card_activity);
        ImmersionBar.with(this).titleBar(mCardActivity).init();
        mCardQuestion = findViewById(R.id.card_question);
        mCardAnswer = findViewById(R.id.card_answer);
        mCardMore = findViewById(R.id.card_more);
    }

    /**
     * 初始化数据
     */
    @Override
    protected void initData() {
        mCardQuestion.setText(card.getQuestion());
        mCardAnswer.setText(card.getAnswer());
        mCardMore.setText(card.getMore());
    }

}