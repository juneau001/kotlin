/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACES: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 8
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the stringTemplateElement.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun box(): String? {
    val `true` = "0"
    val `false` = "1"

    val x1 = "${`false`}"
    val x2 = "..." + "...$`true`..." + "..."
    var x3 = "$`false`${`true`}$`false`"

    if (`false` != "1") return null
    if (`true` != "0") return null

    if (x1 != "1") return null
    if (x2 != "......0......") return null
    if (x3 != "101") return null

    return "OK"
}
