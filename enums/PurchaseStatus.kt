open class PurchaseStatus {

    object InProgress: PurchaseStatus()

    object Ready: PurchaseStatus()

    data class Canceled(val reason: String): PurchaseStatus()
}