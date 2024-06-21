
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ClaimReceiptManager from "./components/listers/ClaimReceiptCards"
import ClaimReceiptDetail from "./components/listers/ClaimReceiptDetail"

import ReviewReviewManager from "./components/listers/ReviewReviewCards"
import ReviewReviewDetail from "./components/listers/ReviewReviewDetail"

import PayPaymentManager from "./components/listers/PayPaymentCards"
import PayPaymentDetail from "./components/listers/PayPaymentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/claims/receipts',
                name: 'ClaimReceiptManager',
                component: ClaimReceiptManager
            },
            {
                path: '/claims/receipts/:id',
                name: 'ClaimReceiptDetail',
                component: ClaimReceiptDetail
            },

            {
                path: '/reviews/reviews',
                name: 'ReviewReviewManager',
                component: ReviewReviewManager
            },
            {
                path: '/reviews/reviews/:id',
                name: 'ReviewReviewDetail',
                component: ReviewReviewDetail
            },

            {
                path: '/pays/payments',
                name: 'PayPaymentManager',
                component: PayPaymentManager
            },
            {
                path: '/pays/payments/:id',
                name: 'PayPaymentDetail',
                component: PayPaymentDetail
            },



    ]
})
