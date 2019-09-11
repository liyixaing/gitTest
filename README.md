#gitTest-Delete

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
public void CloneTest() {

        //https://gitee.com/limoversion/version.git

        try {

            URL remoteURL = new URL("https://github.com/liyixaing/gitTest.git");

            LMRepo repo = new LMRepo(this, remoteURL);

            if (repo.Clone(new LMTransferProgress() {

                @Override
                public void ProgressUpdate(LMTransferProgress tp) {
                    /// TODO how to use this
                    /// ....
                    Log.e("GIT2", String.format("TP:%d/%d", tp.getReceivedObjects(), tp.getTotalObjects()));
                }

            }, new LMCheckoutProgress() {

                @Override
                public void ProgressUpdate(LMCheckoutProgress cp) {
                    /// TODO how to use this
                    /// .... Bytes
                    Log.e("GIT2", String.format("CP:%.2f KB/%.2f KB", cp.getCurSize() / 1024.0, cp.getTotalSize() / 1024.0));
                }

            })) {

                // 页面按钮切换为进入之类的操作

            } else {

                // Clone 失败

            }


        } catch (MalformedURLException urle) {

            urle.printStackTrace();

        } catch (LMCoreExpection lmcoree) {

            lmcoree.printStackTrace();

        }



         })) {

                // 页面按钮切换为进入之类的操作

            } else {

                // Clone 失败

            }


        } catch (MalformedURLException urle) {

            urle.printStackTrace();

        } catch (LMCoreExpection lmcoree) {

            lmcoree.printStackTrace();

        }

    }
