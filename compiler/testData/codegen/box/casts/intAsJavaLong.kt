// TARGET_BACKEND: JVM

// Non-IR pushes `Int` into the list.
// IGNORE_BACKEND: JVM
// IGNORE_LIGHT_ANALYSIS

// FIR (correctly?) does not resolve `add`, since the argument is not `Long`.
// IGNORE_BACKEND_FIR: JVM_IR

fun box(): String {
    val list = ArrayList<Long>()
    list.add(5.inv())
    return if (list[0] == -6L) "OK" else "fail: ${list[0]} != -6"
}
