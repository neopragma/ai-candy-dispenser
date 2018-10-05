package br.com.aviebrantz.aicandydispenser

class LabelManager(labels: List<String>) {

    private val LABELS = labels
    private var currentLabel = ""

    internal fun raffleLabel():String {
        var newLabel:String
        do {
            val idx = (Math.random() * LABELS.size).toInt()
            newLabel = LABELS[idx]
        } while (newLabel == currentLabel)
        currentLabel = newLabel
        return currentLabel
    }
}