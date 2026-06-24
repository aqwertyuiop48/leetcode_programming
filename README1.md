#### Leetcode CLI details
- extension link: https://marketplace.visualstudio.com/items?itemName=LeetCode.vscode-leetcode
- git repo: https://github.com/LeetCode-OpenSource/vscode-leetcode

#### To get the leetcode token from the browser
- Got to https://leetcode.com/
- Network tab -> Headers -> Cookie (copy the entire thing for login)

#### To use leetcode credentials in Google Colab
Add the Secret to Colab
- Open your Colab notebook.
- Click the Key icon on the left-hand toolbar.
- Click "Add new secret".Set the Name (e.g., LEETCODE_USERNAME) and paste your token into the Value field.
- Important: Toggle the "Notebook access" switch to ON for that specific secret.
- For my project, I have used credentials from multiple leetcode accounts, since using the same account's credentials for all problems would cause Rate Limit Error (error code: 429).
