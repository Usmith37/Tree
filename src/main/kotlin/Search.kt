import java.util.*
import java.util.ArrayDeque

class Search {
    fun <T> bfs(root: TreeNode<T>) {
        val queue: Queue<TreeNode<T>> = ArrayDeque()
        queue.add(root)

        var currentNode: TreeNode<T>
        while (!queue.isEmpty()) {
            currentNode = queue.remove()
            println("Visited: " + currentNode.value)
            for (child in currentNode.children){
                queue.add(child)
            }
        }
    }

    fun <T> dfs(root: TreeNode<T>) {
        val stack: Stack<TreeNode<T>> = Stack()
        stack.add(root)

        var currentNode: TreeNode<T>
        while (!stack.isEmpty()) {
            currentNode = stack.pop()
            println("Visited: " + currentNode.value)
            for (child in currentNode.children){
                stack.push(child)
            }
        }
    }
}