# Create the Manual Page
.\" Manpage for Project4
.TH PROJECT4 1 "Feb 2025" "1.0" "Project 4 Manual"
.SH NAME
project4 \- A tool to change file permissions, create symbolic links, and manage process IDs.
.SH SYNOPSIS
.B project4
.SH DESCRIPTION
This project provides a GUI menu with options for the following:
.IP 1. Change file permissions.
.IP 2. Create symbolic links.
.IP 3. Save process IDs to a file.

You can also run 
.B project4 
from the terminal with DOS commands as arguments:
.TP
.B project4 dir
will run the 
.I ls 
command.
.SH OPTIONS
.EX
dir    Run 
.I ls
to list files.
.SH AUTHOR
Developed by your team members.

## To install the manual page, move it to /usr/share/man/man1/:
sudo mv project4.1 /usr/share/man/man1/
