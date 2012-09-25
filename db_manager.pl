#!/usr/bin/perl -w

package DbManager;

sub new {
   my $arg0 = $_[0];
   my $cls = ref($arg0) || $arg0;
   my $this = {};
   bless $this, $cls;
   return $this;
}
