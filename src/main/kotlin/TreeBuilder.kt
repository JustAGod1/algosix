object TreeBuilder {

    fun buildTree(arr: IntArray) : TreeNode? {
        return buildTree(arr,0)
    }

    private fun buildTree(arr: IntArray, idx: Int): TreeNode? {
        if (arr.size-idx <= 0) return null
        val node = TreeNode(arr[idx])
        node.left = buildTree(arr, idx * 2 + 1)
        node.right = buildTree(arr, idx*2+2)

        return node
    }

}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun toString(): String = `val`.toString()
}

