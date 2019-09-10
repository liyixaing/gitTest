#gitTest
 @OnClick({R.id.invite_btn, R.id.register_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.invite_btn://邀请链接
                ToastUtils.showLongToast(context, "邀请链接");
//                openInviteUrl();
                break;
            case R.id.register_btn://注册链接
                openRegisterUrl();
                break;
        }
    }


 //打开邀请链接
    private void openInviteUrl() {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                (Uri.parse(inviteUrl))
        ).addCategory(Intent.CATEGORY_BROWSABLE)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
