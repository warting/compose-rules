package com.twitter.rules.ktlint.compose

import com.pinterest.ktlint.test.RuleSetProviderTest

class TwitterComposeRuleSetProviderTest : RuleSetProviderTest(
    rulesetClass = TwitterComposeRuleSetProvider::class.java,
    packageName = "com.twitter.rules.ktlint.compose"
)