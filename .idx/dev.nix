nix
{ pkgs }: {
  name = "mortgage-project";
  packages = [
    pkgs.maven
  ];
}