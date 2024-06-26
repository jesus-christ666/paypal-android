package com.paypal.android.corepayments

enum class Environment(internal val url: String, internal val graphQLEndpoint: String) {
    LIVE(
        "https://api.paypal.com",
        "https://www.paypal.com"
    ),
    SANDBOX(
        "https://api.sandbox.paypal.com",
        "https://www.sandbox.paypal.com"
    ),
}
