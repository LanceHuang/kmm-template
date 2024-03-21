import kotlin.js.JsExport

// 加这个注解jsBrowserDistribution才能导出
@JsExport
fun hello(name: String): String {
    return "Hello, $name!"
}