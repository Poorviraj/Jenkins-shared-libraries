def call(String url, String branch) {
  echo "this is clonning code stage"
  git url:"${url}", branch:"${branch}"
}
