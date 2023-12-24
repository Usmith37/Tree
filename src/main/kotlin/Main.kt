fun main() {
    val node1 = TreeNode<String>( "1")
    val node2 = TreeNode<String>( "2")
    val node3 = TreeNode<String>( "3")
    val node4 = TreeNode<String>( "4")
    val node5 = TreeNode<String>( "5")
    val node6 = TreeNode<String>( "6")
    val node7 = TreeNode<String>( "7")
    val node8 = TreeNode<String>( "8")

    node1.addChild(node2)
    node1.addChild(node3)
    node2.addChild(node4)
    node2.addChild(node5)
    node2.addChild(node6)
    node3.addChild(node7)
    node4.addChild(node8)

    println(node1)

    val search = Search();
    println("Start BFS")
    search.bfs(node1)
    println("Start DFS")
    search.dfs(node1)
}